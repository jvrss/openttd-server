package de.litexo.security;

import jakarta.inject.Inject;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.container.PreMatching;
import jakarta.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
@PreMatching
public class SecurityFiler implements ContainerRequestFilter {
    @Inject
    SecurityService securityService;


    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        securityService.validatedLoginSession(requestContext);
    }


}
