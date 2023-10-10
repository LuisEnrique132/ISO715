package com.bd.controller;

import com.bd.entity.Libro;
import com.bd.facade.LibroFacade;
import com.bd.controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "libroController")
@ViewScoped
public class LibroController extends AbstractController<Libro> {

    @Inject
    private MobilePageController mobilePageController;

    public LibroController() {
        // Inform the Abstract parent controller of the concrete Libro Entity
        super(Libro.class);
    }

}
