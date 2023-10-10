package com.bd.controller;

import com.bd.entity.Configuracion;
import com.bd.facade.ConfiguracionFacade;
import com.bd.controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "configuracionController")
@ViewScoped
public class ConfiguracionController extends AbstractController<Configuracion> {

    @Inject
    private MobilePageController mobilePageController;

    public ConfiguracionController() {
        // Inform the Abstract parent controller of the concrete Configuracion Entity
        super(Configuracion.class);
    }

}
