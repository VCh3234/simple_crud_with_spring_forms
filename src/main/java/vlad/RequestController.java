package vlad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vlad.data_access_objects.DAO;
import vlad.data_access_objects.VehicleDAO;
import vlad.data_access_objects.entities.VehicleEntity;

import java.util.List;

@Controller
public class RequestController {
    @Autowired
    private DAO<VehicleEntity> dao;
    @GetMapping("/get")
    public String getAllVehicles(Model model) {
        List<VehicleEntity> vehicleList = dao.getAll();
        model.addAttribute("vehicleList", vehicleList);
        return "index";
    }
}
