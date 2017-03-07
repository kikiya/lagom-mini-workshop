
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kiki/workspace/online-auction-scala/web-gateway/conf/routes
// @DATE:Mon Mar 06 22:18:46 EST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseItemController ItemController = new controllers.ReverseItemController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProfileController ProfileController = new controllers.ReverseProfileController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMain Main = new controllers.ReverseMain(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseItemController ItemController = new controllers.javascript.ReverseItemController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProfileController ProfileController = new controllers.javascript.ReverseProfileController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMain Main = new controllers.javascript.ReverseMain(RoutesPrefix.byNamePrefix());
  }

}
