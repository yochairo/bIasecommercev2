//package com.bi_as.biasApp;
//import java.util.List;
//
//import com.bi_as.biasApp.domain.User;
//import com.bi_as.biasApp.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
//@RestController
//@RequestMapping({"/k1/user"})
//public class Controlador {
//
//    @Autowired
//    UserService service;
//
////    @PostMapping
////    public User agregar(@RequestBody User user){
////        return service.save(user);
////    }
//
//
//    @PostMapping
//    public User agregar(@RequestBody User p)
//    {    return service.verifyUser(p);    }
//
//
//
////    @GetMapping(path = {"/{id}"})
////    public User listarId(@PathVariable("id")int id){
////        return service.listarId(id);
////    }
////    @PutMapping(path = {"/{id}"})
////    public User editar(@RequestBody User p,@PathVariable("id") int id){
////        p.setIdUser(id);
////        return service.edit(p);
////    }
////    @DeleteMapping(path = {"/{id}"})
////    public User delete(@PathVariable("id") int  id){
////        return service.delete(id);
////    }
//}