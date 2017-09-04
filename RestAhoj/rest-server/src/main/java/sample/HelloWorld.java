package sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
 
@Path("/user")
public class HelloWorld {
 
  @GET
  @Path("/{name}")
  public String sayHello(@PathParam("name") String name) {
    String output = "Ahoj " + name + "!";
    return output;
  }
}
