O problema do código era no mapeamento dos relacionamentos. Além disso, troquei o @NotBlank por @NotNull nos atributos do tipo Date e Integer. O @NotBlank não indicado para esses tipos.

Coloquei o exemplo no [Github][2] com um teste unitário para persistir em um banco.        


   

    public class EventPlace {
            @OneToMany(mappedBy = "place")
            private List<Event> event = new ArrayList<>();
        }
    
    
       
        public class Event {
            @ManyToOne
            @JoinColumn(name = "EVENT_PLACE_IDPLACE", referencedColumnName = "id")
            private EventPlace place;
        }

//classes completas

    @Entity 
    @Table(name = "EVENT_PLACE") 
    public class EventPlace {
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID", unique = true, nullable = false)
        private long idPlace;

        @Column(name = "NAME", nullable = false, length = 150)
        @NotBlank
        private String name;

        @Column(name = "ADDRESS", nullable = false, length = 150)
        @NotBlank
        private String address;

        @Column(name = "CAPACITY")
        private int capacity;

        @Column(name = "cep", nullable = false, length = 35)
        private String cep;

        @OneToMany(mappedBy = "place")
        private List<Event> event = new ArrayList<>();
        
        //getters and setters

    }


        @Entity
        @Table(name = "EVENT") 
        public class Event {
            
            private static final long serialVersionUID = 1L;

            @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
            @Column(name = "ID", unique = true, nullable = false)
            private long idEvent;

            @Column(name = "name", nullable = false, length = 80)
            @NotBlank
            private String name;

            @Column(name = "DATE_HOUR", nullable = false)
            @NotNull
            private Date dateHour;

            @Column(name = "AMOUNT_TICKET", nullable = false)
            @NotNull
            private int amountTicket;

            @Column(name = "VALUE_TICKET", nullable = false)
            @NotNull
            private Double valueTicket;

            @Column(name = "EVENT_EXPIRE", nullable = false)
            @NotNull
            private Date eventExpire;

            @Column(name = "description", nullable = false, length = 300)
            @NotBlank
            @Lob
            private String description;

            @ManyToOne
            @JoinColumn(name = "EVENT_PLACE_IDPLACE", referencedColumnName = "id")
            private EventPlace place;


        //getters and setters
    }



[![inserir a descrição da imagem aqui][1]][1]



  [1]: https://i.stack.imgur.com/Ur6Oy.png
  [2]: https://github.com/rafaelchagasb/answers-stackoverflow/tree/master/pt.stackoverflow.com/spring-java/452394/
