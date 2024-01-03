package dev.mocad.webschool.service;

import dev.mocad.webschool.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

  private static final Logger log = LoggerFactory.getLogger(ContactService.class);

  public boolean saveMessage(Contact contact) {
    boolean isSaved = true;
    log.info(contact.toString());
    return true;
  }
}
