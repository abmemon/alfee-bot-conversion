package bot.conversion.botconversion;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="bot_conversation")
public class BotConversion {
    @Id  //primary key
    private Integer id;

    private String  conversation_type;
    private String  whatsapp_bot_script;
    private String  opt_1;
    private String  opt_2;
    private String  opt_3;
    private String  opt_4;
    private String  opt_1_res;
    private String  opt_2_res;
    private String  opt_3_res;
    private String  remarks;
    
}
