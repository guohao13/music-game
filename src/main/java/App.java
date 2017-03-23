import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/bands-new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/bands-new.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/bands/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Band band = Band.findBand(Integer.parseInt(request.params(":id")));
      model.put("band", band);
      model.put("template", "templates/band.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("bands/:id/members/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Band band = Band.findBand(Integer.parseInt(request.params(":id")));
      model.put("band", band);
      model.put("template", "templates/members-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/bands", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String bandName1 = request.queryParams("bandName1");
      String bandName2 = request.queryParams("bandName2");
      Band band1 = new Band(bandName1);
      Band band2 = new Band(bandName2);
      model.put("bands", Band.getBandInstances());
      model.put("template", "templates/bands.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/bands:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Band band = Band.findBand(Integer.parseInt(request.queryParams("bandId")));
      String leadSinger = request.queryParams("leadSinger");
      String drummer = request.queryParams("drummer");
      String bassist = request.queryParams("bassist");
      Hero newHero1 = new Hero(leadSinger);
      Hero newHero2 = new Hero(drummer);
      Hero newHero3 = new Hero(bassist);
      band.addHero(newHero1);
      band.addHero(newHero2);
      band.addHero(newHero3);
      model.put("band", band);
      model.put("template", "templates/band.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    // post("/bands/:id", (request, response) -> {
    // //   Map<String, Object> model = new HashMap<String, Object>();
    // //   Band band = Band.findBand(Integer.parseInt(request.params(":id")));
    // //   model.put("band", band);
    // //   model.put("template", "templates/band.vtl");
    // //   return new ModelAndView(model, layout);
    // // }, new VelocityTemplateEngine());

  }
}
