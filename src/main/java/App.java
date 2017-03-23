import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    List<Band> bands = new ArrayList<Band>();
    List<Hero> heroes = new ArrayList<Hero>();


    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/bands", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("bands", Band.getBandInstances());
      model.put("template", "templates/bands.vtl");
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

    get("/bands/:id1/members/:id2", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Band band = Band.findBand(Integer.parseInt(request.params(":id1")));
      Hero member = Hero.findHero(Integer.parseInt(request.params(":id2")));
      model.put("band", band);
      model.put("member", member);
      model.put("template", "templates/hero.vtl");
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

    post("/bands/:id", (request, response) -> {
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
      System.out.println("Size of band-" + band.getBandMembers());
      model.put("band", band);
      model.put("template", "templates/band.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/arena", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      if (bands.size() < 2) {
        Band band = Band.findBand(Integer.parseInt(request.queryParams("bandId")));
        Hero hero = Hero.findHero(Integer.parseInt(request.queryParams("memberId")));
        bands.add(band);
        heroes.add(hero);
        model.put("bands", Band.getBandInstances());
        model.put("template", "templates/bands.vtl");
      }
      if (bands.size() == 2) {
        Game newGame = new Game (bands.get(0),bands.get(1), heroes.get(0), heroes.get(1));
        model.put("template", "templates/arena.vtl");
      }
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
