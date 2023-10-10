package com.bd.controller;

import com.bd.entity.Editorial;
import com.bd.facade.EditorialFacade;
import com.bd.controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "editorialController")
@ViewScoped
public class EditorialController extends AbstractController<Editorial> {

    @Inject
    private MobilePageController mobilePageController;

    public EditorialController() {
        // Inform the Abstract parent controller of the concrete Editorial Entity
        super(Editorial.class);
    }

}
