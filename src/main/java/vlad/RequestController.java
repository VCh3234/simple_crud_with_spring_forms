package vlad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vlad.data_access_objects.dao.DAO;
import vlad.data_access_objects.entities.VehicleEntity;
import vlad.data_access_objects.services.CRUDService;

import java.util.List;

@Controller
public class RequestController {
    @Autowired
    private CRUDService<VehicleEntity> service;
    @GetMapping("/getAll")
    public String getAllVehicles(Model model) {
        List<VehicleEntity> vehicleList = service.getAll();
        model.addAttribute("vehicleList", vehicleList);
        return "index";
    }
}
