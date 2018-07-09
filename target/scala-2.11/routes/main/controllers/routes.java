
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Kieran/Documents/Programming/Apprenticeship-Portal/conf/routes
// @DATE:Mon Jul 09 20:54:34 BST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCandidatePortalController CandidatePortalController = new controllers.ReverseCandidatePortalController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseManagerPortalController ManagerPortalController = new controllers.ReverseManagerPortalController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseExamController ExamController = new controllers.ReverseExamController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLoginController LoginController = new controllers.ReverseLoginController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAdminPortalController AdminPortalController = new controllers.ReverseAdminPortalController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCandidatePortalController CandidatePortalController = new controllers.javascript.ReverseCandidatePortalController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseManagerPortalController ManagerPortalController = new controllers.javascript.ReverseManagerPortalController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseExamController ExamController = new controllers.javascript.ReverseExamController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLoginController LoginController = new controllers.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAdminPortalController AdminPortalController = new controllers.javascript.ReverseAdminPortalController(RoutesPrefix.byNamePrefix());
  }

}
