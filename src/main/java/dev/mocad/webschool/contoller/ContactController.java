package dev.mocad.webschool.contoller;


import dev.mocad.webschool.model.Contact;
import dev.mocad.webschool.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import static org.springframework.web.bind.annotation.RequestMethod.POST;


@Controller
public class ContactController {

  @Autowired
  private ContactService contactService;

  private static final Logger log = (Logger) LoggerFactory.getLogger(ContactController.class);

    @RequestMapping("/contact")
    public String displayContactPage() {
        return "contact.html";
    }

    @PostMapping("/saveMsg")
    public ModelAndView saveMessage(Contact contact) {
        contactService.saveMessage(contact);
        return new ModelAndView("redirect:/contact");

    }




}
