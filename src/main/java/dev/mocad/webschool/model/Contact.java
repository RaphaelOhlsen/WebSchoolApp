package dev.mocad.webschool.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Contact {

  @NotBlank(message = "Name is mandatory")
  @Size(min=3, message = "Name should have at least 3 characters")
  private String name;

  @NotBlank(message = "Mobile number is mandatory")
  @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number is invalid, it must have 10 digits")
  private String mobileNum;

  @NotBlank(message = "Email is mandatory")
  @Email
  private String email;

  @NotBlank(message = "Subject is mandatory")
  @Size(min=5, message = "Subject should have at least 5 characters")
  private String subject;

  @NotBlank(message = "Message is mandatory")
  @Size(min=10, message = "Message should have at least 10 characters")
  private String message;
}
