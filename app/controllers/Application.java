package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Controller.
 */
public class Application extends Controller {

  /**
   * Displays the result of compilation.
   * @return String To confirm if the application is ready.
   */
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }

}
