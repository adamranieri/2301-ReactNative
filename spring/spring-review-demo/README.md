## Beans (Non-Exhautive):
- PetController
  - Dependencies: PetServiceImpl
- PetServiceImpl
  - Dependencies: PetRepository
- PetRepository
  - Dependencies: Inner Beans and JpaMappingContext

## Annotations Used:

### Spring
- @Autowired
  - Stereotypes:
    - @Component
    - @Service
    - @Controller
    - @Repository

### Spring Web
- @RequestMapping
- @ReponseBody
- @ReponseStatus
- @GetMapping
- @PostMapping
- @PatchMapping
- @DeleteMapping
- @PutMapping
- Get Data from Requests:
  - @RequestBody
  - @PathVariable
  - @RequestParam
- @RestController

### Spring Data
- @Query
- @Transactional

### Persistence:
- @Entity
- @Table
- @Column
- @Id
- @GeneratedValue

### Spring Boot
- @SpringBootApplication
  - @ComponentScan
  - @Configuration
  - @EnableAutoConfiguration

```mermaid
flowchart TD
    A[HTTP Request] --- B(Dispatcher Servlet)
    B --- C{Pet Controller}
    B --- D{User Controller}
    B --- H{Account Controller}
    C -- Pet Model --- E{Pet Service}
    E -- Pet Model --- F{Pet Repository}
    F --- G[Database]
    
    %% Dependency Injection
    E -. DI .-> C
    F -. DI .-> E
```

### MVC
- Controller - PetController
- Model - Pet entity
- View - Handled in React