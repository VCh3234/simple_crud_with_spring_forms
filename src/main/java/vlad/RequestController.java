package vlad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
        model.addAttribute("newVehicle", vehicle);
        return "vehicle_form";
    }

    @PostMapping("/add-new-vehicle")
    private String addNewVehicle(@ModelAttribute("newVehicle") VehicleEntity vehicle) {
        service.add(vehicle);
        return "redirect:/get-all-vehicles";
    }

}
