package controllers;

import com.encentral.staffsync.commons.util.ObjMapper;
import com.encentral.staffsync.configuration.permission.api.IPermission;
import com.encentral.staffsync.configuration.permission.model.Permission;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import play.data.Form;
import play.data.FormFactory;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import java.io.IOException;
import java.util.Optional;

@Transactional
public class PermissionController extends Controller {

    @Inject
    IPermission permissionService;

    @Inject
    ObjMapper objectMapper;

    @Inject
    FormFactory formFactory;

    public Result createPermission() {

        String contentType = request().getHeaders().get("Content-Type").orElse(null);
        System.out.println("\n\n\n");
        if (contentType != null) {
            Permission permission;
            if (contentType.startsWith("application/json")) {
                JsonNode requestData = request().body().asJson();

                try {
                    permission = objectMapper.readValue(requestData.traverse(), Permission.class);
                } catch (IOException e) {
                    return badRequest("Invalid Data");
                }

            } else if (contentType.startsWith("application/x-www-form-urlencoded")) {
                Form<Permission> permissionForm = formFactory.form(Permission.class).bindFromRequest();
                if (permissionForm.hasErrors())
                    return badRequest(permissionForm.errorsAsJson());

                permission = permissionForm.get();
            } else {
                return badRequest("Invalid content type ---> " + contentType);
            }

            System.out.println(permission);
            System.out.println("How to enter the permission service");
            Optional<Permission> result = permissionService.addPermission(permission);
            System.out.println("I came out of the Service");
            if (result.isPresent()) {
                permission = result.get();
                System.out.println("After Persistence: " + permission);
//                jsonResponse = objectMapper.writeValueAsString(permission);
                System.out.println("The converted JsonResponse: This ie where I'm running to errors" );

                return ok(permission.toString());


            }
            System.out.println("Permission was not persisted for some reasons");
            return internalServerError("Something went wrong");
        }

        return badRequest("Data Required");
    }

}
