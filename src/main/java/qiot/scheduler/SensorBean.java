package qiot.scheduler;

import io.quarkus.scheduler.Scheduled;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import qiot.rest.client.SensorDataCollectionInterface;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/** Basic scheduler, maybe use reactive flow?
 *
 */


@ApplicationScoped
public class SensorBean {

    @Inject
    @RestClient
    SensorDataCollectionInterface service;

    @Scheduled(every="10s")
    void getSensorData() {
        System.out.println("get sensor data"); // temp
        System.out.println(service.getGas());
        System.out.println(service.getPollution());
    }
}
