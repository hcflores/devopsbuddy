package com.devopsbuddy.web.controllers;

import com.devopsbuddy.web.domain.frontend.ContactPojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

    /** the application logger **/
    private static final Logger logger = LoggerFactory.getLogger(ContactController.class);

    /** the key which identified hte feedback payload in hte model */
    public static final String CONTACT_MODEL_KEY = "contact";

    /** the contact us view name */
    public static final String CONTACT_US_VIEW_NAME = "contact/contact";

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contactGet(ModelMap model) {
        logger.debug("ContactController :: contactGet");
        ContactPojo contactPojo = new ContactPojo();
        model.addAttribute(ContactController.CONTACT_MODEL_KEY, contactPojo);
        return ContactController.CONTACT_US_VIEW_NAME;
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public String contactPost(@ModelAttribute(CONTACT_MODEL_KEY) ContactPojo contactPojo) {
        logger.debug("Contact POJO content: {}", contactPojo);
        return ContactController.CONTACT_US_VIEW_NAME;
    }
}
