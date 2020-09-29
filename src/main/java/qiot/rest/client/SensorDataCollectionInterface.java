package qiot.rest.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// see also example http://www.mastertheboss.com/javaee/eclipse-microservices/microprofile-rest-client-api

@Path("/")
@RegisterRestClient(configKey="sensor-api") // key for resources/application.properties
public interface SensorDataCollectionInterface {
    @GET
    @Path("/gas")
    @Produces("application/json")
    public String getGas();

    @GET
    @Path("/pollution")
    @Produces("application/json")
    public String getPollution();
}
