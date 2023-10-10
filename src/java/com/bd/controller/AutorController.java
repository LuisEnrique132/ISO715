package com.bd.controller;

import com.bd.entity.Autor;
import com.bd.facade.AutorFacade;
import com.bd.controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "autorController")
@ViewScoped
public class AutorController extends AbstractController<Autor> {

    @Inject
    private MobilePageController mobilePageController;

    public AutorController() {
        // Inform the Abstract parent controller of the concrete Autor Entity
        super(Autor.class);
    }

}
