@Data
@Builder
public class User {
    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy MM dd")
    private Date birthDate;
}
