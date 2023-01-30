package vlad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vlad.data_access_objects.entities.VehicleEntity;
import vlad.data_access_objects.services.CRUDService;

import java.util.List;

@Controller
public class RequestController {
    @Autowired
    private CRUDService<VehicleEntity> service;
    @GetMapping("/get-all-vehicles")
    private String getAllVehicles(Model model) {
        List<VehicleEntity> vehicleList = service.getAll();
        model.addAttribute("vehicleList", vehicleList);
        return "all_vehicles";
    }

    @GetMapping("/get-form")
    private String sendForm(Model model) {
        VehicleEntity vehicle = new VehicleEntity();
        model.addAttribute("vehicle", vehicle);
        return "vehicle_form";
    }

    @PostMapping("/save-vehicle")
    private String addNewVehicle(@ModelAttribute("newVehicle") VehicleEntity vehicle) {
        service.save(vehicle);
        return "redirect:/get-all-vehicles";
    }

    @GetMapping("/update-vehicle")
    private String sendFormForUpdateVehicle(@RequestParam("vehicleId") long id, Model model) {
        VehicleEntity vehicle = service.getById(id);
        model.addAttribute("vehicle", vehicle);
        return "vehicle_form";
    }

    @GetMapping("/delete-vehicle")
    private String deleteVehicle(@RequestParam("vehicleId") long id) {
        service.delete(id);
        return "redirect:/get-all-vehicles";
    }

}
