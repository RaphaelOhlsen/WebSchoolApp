package dev.mocad.webschool.service;

import dev.mocad.webschool.model.Contact;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Getter
@Setter
@Slf4j
@Service
@SessionScope
public class ContactService {

  private int counter = 0;

  public ContactService() {
    log.info("ContactService instance created");
  }

  public boolean saveMessage(Contact contact) {
    boolean isSaved = true;
    log.info(contact.toString());
    return isSaved;
  }
}
