package de.litexo.security;

import jakarta.annotation.security.PermitAll;
import jakarta.inject.Inject;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.Response;
import java.util.Optional;

import static de.litexo.security.SecurityService.HEADER_OPENTTD_SERVER_SESSION_ID;


@Path("/api/auth")
@PermitAll
public class AuthResource {

    @Inject
    SecurityService securityService;

    @Path("/login")
    @POST()
    public Response login(@HeaderParam(HttpHeaders.AUTHORIZATION) String authHeader) {
        Optional<BasicAuthSession> login = securityService.login(authHeader);
        if (login.isPresent()) {
            return Response.status(200).header(HEADER_OPENTTD_SERVER_SESSION_ID, login.get().getSessionId()).build();
        }
        return Response.status(401).build();
    }

    @Path("/verifyLogin")
    @POST()
    public Response verifyLogin(@HeaderParam(HEADER_OPENTTD_SERVER_SESSION_ID) String session) {
        if (securityService.isLoggedIn(session)) {
            return Response.status(200).header(HEADER_OPENTTD_SERVER_SESSION_ID, session).build();
        }
        return Response.status(401).build();
    }

    @Path("/logout")
    @POST
    public Response logout(@HeaderParam(HEADER_OPENTTD_SERVER_SESSION_ID) String session) {
        securityService.logout(session);
        return Response.ok().build();
    }


}
