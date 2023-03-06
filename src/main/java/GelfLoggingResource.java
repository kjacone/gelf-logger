import javax.enterprise.context.ApplicationScoped;
// import javax.ws.rs.GET;
// import javax.ws.rs.Path;

import org.jboss.logging.Logger;

// @Path("/gelf-logging")
@ApplicationScoped
public class GelfLoggingResource {
    private static final Logger LOG = Logger.getLogger(GelfLoggingResource.class);

    // @GET
    public void log() {

// while (true) { 
    LOG.info("Some useful log message");
    LOG.error("Some error occur");
    LOG.debug("Some debugging msg message");
// }
       




    }



}