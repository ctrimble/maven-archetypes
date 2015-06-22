#parse("variables.vm")
package ${package}.resource;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.common.collect.Maps;

@Path("/")
public class RootResource {
	@GET
	@Produces("application/json")
	public Map<String, String> root() {
		return Maps.newHashMap();
	}
}