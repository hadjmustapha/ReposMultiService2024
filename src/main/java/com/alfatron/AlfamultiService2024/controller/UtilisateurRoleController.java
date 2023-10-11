package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.UtilisateurRole_Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/UtilisateurRole")
@CrossOrigin
public class UtilisateurRoleController implements UtilisateurRole_Api {
}
