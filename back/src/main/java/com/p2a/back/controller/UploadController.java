package com.p2a.back.controller;

import com.p2a.back.model.Uploads;
import com.p2a.back.repository.UploadsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UploadController {
    private final UploadsRepository uploadsRepository;
    public UploadController(UploadsRepository uploadsRepository) {
        this.uploadsRepository = uploadsRepository;
    }
    @GetMapping("/upload")
    public String uploadFormShow(Model model){
        model.addAttribute("uploads", new Uploads());
        return "upload-form";
    }
    @PostMapping("/upload")
    public String uploadFormSubmit(@ModelAttribute("uploads") Uploads uploads) {
        System.out.println("TEST");
        uploadsRepository.save(uploads);

        return "redirect:/";
    }


}
