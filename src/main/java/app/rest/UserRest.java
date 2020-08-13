package app.rest;

import app.rest.model.User;
import app.rest.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;


@RestController
@RequestMapping("/lead")
public class UserRest {
    @Inject
    private UserService userService;


    @Operation(summary = "Create leads")
    @PostMapping(path = "/")
    public ResponseEntity<Object> create(@RequestBody User user){
        userService.createUser(user);
        return new ResponseEntity<>(user,
                HttpStatus.OK);
    }
}
