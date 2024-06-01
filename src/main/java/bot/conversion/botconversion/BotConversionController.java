package bot.conversion.botconversion;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bot")
public class BotConversionController {

    @Autowired
    private IBotConversion iBotConversion;
    @GetMapping("/conversation")
    public Collection<BotConversion> viewAll(){
        return iBotConversion.findAll();
    }

}
