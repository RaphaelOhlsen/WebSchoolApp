package dev.mocad.webschool.contoller;


import dev.mocad.webschool.model.Contact;
import dev.mocad.webschool.service.ContactService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Slf4j
@Controller
public class ContactController {

  @Autowired
  private ContactService contactService;



    @RequestMapping("/contact")
    public String displayContactPage(Model model) {
      model.addAttribute("contact", new Contact());
      return "contact.html";
    }

    @PostMapping("/saveMsg")
    public String saveMessage(@Valid @ModelAttribute Contact contact, Errors errors) {
      if (errors.hasErrors()) {
        log.error("Contact form validation failed due to: " + errors.toString());
        return "contact.html";
      }
      contactService.saveMessage(contact);
      return "redirect:/contact";

    }




}
