
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/jintao/CTS2/CTS/conf/routes
// @DATE:Sun Dec 13 17:02:48 EST 2015

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTools Tools = new controllers.ReverseTools(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCategories Categories = new controllers.ReverseCategories(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHome Home = new controllers.ReverseHome(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAccount Account = new controllers.ReverseAccount(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTools Tools = new controllers.javascript.ReverseTools(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCategories Categories = new controllers.javascript.ReverseCategories(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHome Home = new controllers.javascript.ReverseHome(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAccount Account = new controllers.javascript.ReverseAccount(RoutesPrefix.byNamePrefix());
  }

}
