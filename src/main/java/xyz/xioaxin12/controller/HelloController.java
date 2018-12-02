package xyz.xioaxin12.controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class HelloController extends Controller {
    @ActionKey("/test")
    public void index(){
        renderText("hello JFinal!");
    }
}
