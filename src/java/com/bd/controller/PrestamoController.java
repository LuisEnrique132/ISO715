package com.bd.controller;

import com.bd.entity.Prestamo;
import com.bd.facade.PrestamoFacade;
import com.bd.controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "prestamoController")
@ViewScoped
public class PrestamoController extends AbstractController<Prestamo> {

    @Inject
    private MobilePageController mobilePageController;

    public PrestamoController() {
        // Inform the Abstract parent controller of the concrete Prestamo Entity
        super(Prestamo.class);
    }

}
