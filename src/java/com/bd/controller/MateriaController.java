package com.bd.controller;

import com.bd.entity.Materia;
import com.bd.facade.MateriaFacade;
import com.bd.controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "materiaController")
@ViewScoped
public class MateriaController extends AbstractController<Materia> {

    @Inject
    private MobilePageController mobilePageController;

    public MateriaController() {
        // Inform the Abstract parent controller of the concrete Materia Entity
        super(Materia.class);
    }

}
