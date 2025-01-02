package org.xproce.examenbib.web;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.xproce.examenbib.dto.EmpruntDto;
import org.xproce.examenbib.service.EmpruntServiceImpl;

import java.util.List;

@Controller
public class EmpruntController {

    @Autowired
    private EmpruntServiceImpl empruntService;

    @GetMapping("/emprunts/ajouter")
    public String formulaireEmprunt(Model model) {
        model.addAttribute("emprunt", new EmpruntDto());
        return "form";
    }

    @PostMapping("/emprunts/ajouter")
    public String ajouterEmprunt(@Valid @ModelAttribute("emprunt") EmpruntDto empruntDto, BindingResult bindingResult, Model model) {


        empruntService.ajouterEmprunt(empruntDto);
        model.addAttribute("message", "Emprunt ajouté avec succès !");
        return "form";
    }


    @GetMapping("/emprunts/utilisateur/{utilisateurId}")
    public String empruntParUtilisateur(@PathVariable Integer utilisateurId, Model model) {
        List<EmpruntDto> emprunts = empruntService.empruntParUtilisateur(utilisateurId);

        if (emprunts.isEmpty()) {
            model.addAttribute("message", "Cet utilisateur n'a pas effectué des emprunts");
        } else {
            model.addAttribute("emprunts", emprunts);
        }

        return "emprunts_utilisateur";
    }


}