package com.bd.controller;

import com.bd.entity.Estudiante;
import com.bd.facade.EstudianteFacade;
import com.bd.controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "estudianteController")
@ViewScoped
public class EstudianteController extends AbstractController<Estudiante> {

    @Inject
    private MobilePageController mobilePageController;

    public EstudianteController() {
        // Inform the Abstract parent controller of the concrete Estudiante Entity
        super(Estudiante.class);
    }

}
