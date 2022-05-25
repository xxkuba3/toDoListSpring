package xxkuba3.lang;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LangServlet {
    private final Logger logger = LoggerFactory.getLogger(LangServlet.class);

    private final LangService service;

    LangServlet(LangService service) {
        this.service = service;
    }

    // JAVA SPRING

    @GetMapping("/langs")
    ResponseEntity<List<LangDTO>> findAllLangs() {
        logger.info("Got request");
        return ResponseEntity.ok(service.findAll());
    }

    //    JAVA
    //    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //        logger.info("Got request with parameters: " + req.getParameterMap());
    //        resp.setContentType("application/json;charset=UTF-8");
    //        mapper.writeValue(resp.getOutputStream(), service.findAll());
    //    }
}



