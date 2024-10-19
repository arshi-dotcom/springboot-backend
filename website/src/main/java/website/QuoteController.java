package website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/quotes")
public class QuoteController {

    @Autowired
    private QuoteRepository quoteRepository;

    @PostMapping("/save")
    public String saveQuote(@RequestBody Quote quote) {
        quoteRepository.save(quote);
        return "Quote saved successfully!";
    }
}
