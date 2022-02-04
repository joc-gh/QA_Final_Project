# Final Project - SpellTracker

## What Are We Doing And Why?
As a means of marking the end of this Software Development course with [QA](https://www.qa.com/) we are creating individual projects in order to showcase the skills which we have learned. The objective:

>To create a Spring Boot API, with utilisation of supporting tools, methodologies, and technologies, that encapsulates all fundamental and practical modules covered during training.

This will be achieved by producing a back-end developed application written in **Java** with a persistent, managed database hosted locally using **MySQL** that is capable of working with API calls by means of **Postman**. Project management will be conducted through **Jira**. Testing will be carried out with **JUnit** and **Mockito**.

To meet these goals I have decided to make an API which is capable of storing and manipulating some basic information about spells used in the Tabletop Role-Playing Game [Dungeons & Dragons](https://dnd.wizards.com/dungeons-and-dragons/what-is-dd).

### Scope & Minimum Viable Product
* Code fully integrated into a Version Control System using the feature-branch model: main/dev/multiple features.
* A project management board with full expansion on user stories, acceptance criteria and tasks needed to complete the project.
* A risk assessment which outlines the issues and risks faced during the project timeframe.
*	A relational database, locally or within the Cloud, which is used to persist data for the project. 
*	A functional application ‘back-end’, written in a suitable framework of the language covered in training (Java/Spring Boot), which meets the requirements set on your Scrum Kanban board.
*	A build (.jar) of your application, including any dependencies it might need, produced using an integrated build tool (Maven).
*	A series of API calls designed with postman, used for CRUD functionality. (Create, Read, Update, Delete)
*	Fully designed test suites for the application you are creating, including both unit and integration tests.

<p align="right">(<a href="#top">back to top</a>)</p>

## How I Expected The Challenge To Go
Going into this project directly on the heels of a rather intensive and somewhat overloading week of Spring Boot training, I did have initial concerns over being able to reconstitute this knowledge by myself into something practical. Testing in particular was a point of potential complexity. 

Making full use of QA's course resources and under the primary guidance of trainer [Morgan Walsh](https://github.com/MrWalshyType2), it has proven to be an enjoyable and mentally stimulating process. It is rewarding to think back over what I was capable of at the start of the course (or even just a week ago!) and then see what I can do now.

<p align="right">(<a href="#top">back to top</a>)</p>

## What Went Well & What Went Not-So-Well?

Even as a solo project, being able to use the Agile methodology in a practical setting, complete with regular Scrum meetings and using Sprints, was both insightful and motivational.

There proved to be few serious stumbling blocks and the week-long project proceeded at a reasonably regular pace. All software worked as intended, as ultimately did the code. Writing tests was a taxing process but one which *hopefully* worked out well. Reiterating through them whilst trying to improve test coverage ended up being quite satisfying.

The biggest cause of lost time was solving minor errors in writing the code. I lost 15 minutes to a missing semicolon in a lambda expression only this morning! It definitely highlighted the benefits of peer programming to me. A lot of this time might have been saved with some fresh eyes reviewing the code.

Another problem came in the form of getting to grips with actively using the feature-branch model with GitHub. Whilst the theory was fine, actually getting things to go where they were supposed to and remembering to switch to the right branch for coding different things was a bit of a learning curve until it became more habitual.

<p align="right">(<a href="#top">back to top</a>)</p>

## Possible Improvements for Future Revisions Of The Project

There are multiple approaches which could be taken to improve upon this project:

* Implementing the SpellDTO.class which exists as concept only right now
* Expanding the Spell.class entity to hold more fields
* Adding additional entities such as a User/Character.class with one-to-many relationships
* Additional CRUD queries to reflect these additions and their relationships
* Introducing a front-end

<p align="right">(<a href="#top">back to top</a>)</p>

## Postman & API Interactions

In this section we will go through the Postman requests which can be sent and the responding outputs fro the API.

### GET to show empty database - */spell*

A simple GET request to show the database starting empty

![PM Empty DB Start](https://user-images.githubusercontent.com/94961352/152522539-0841f820-def6-40e8-a990-91f6c8026536.png)

### POST to create new spell - */spell*

A request sent with the three required fields to construct a new Spell object in the database

![PM POST Spell](https://user-images.githubusercontent.com/94961352/152523237-01611016-1003-4d49-a9f5-3d5a4fdd84f3.png)

This request also has an extra header showing the new spell's location for finding it by name

![PM POST Spell Headers](https://user-images.githubusercontent.com/94961352/152523368-634c505f-e490-4941-96e3-cf96412a0e55.png)

### PUT to update spell info - */spell/{name}*

Updates the level and school of the spell using the name primary key as the address. The response body contains the updated entry

![PM PUT Spell](https://user-images.githubusercontent.com/94961352/152523723-9399aa17-c723-4c40-88b1-528a0e1077a4.png)

### DELETE to remove spell - */spell/{name}*

Removes spell entry from database, returns empty response body on success

![PM DEL Spell](https://user-images.githubusercontent.com/94961352/152524218-24b5a992-267f-4f30-9ffa-2ad095bf9796.png)

### GET by name - */spell/{name}*

Find a spell from its name (PK)

![PM GET by name](https://user-images.githubusercontent.com/94961352/152524768-940977cc-c57d-44c7-a68a-1680d42ae3d5.png)

### GET by level - */spell/lv/{level}*

Returns a list with all spells of the corresponding level

![PM GET by lv](https://user-images.githubusercontent.com/94961352/152525718-a9bc668f-c256-4520-8a60-6e7c3a8e8c6f.png)

### GET by school - */spell/school/{school}*

Returns a list with all spells of the corresponding school

![PM GET by school](https://user-images.githubusercontent.com/94961352/152525831-3ec88296-8ce1-4d73-869d-200738875fa9.png)

### Custom Exception to any request by - */spell/{name}*

When no entry can found with a matching name (PK), this exception is returned

![PM Custom Exception](https://user-images.githubusercontent.com/94961352/152524528-396ecf8c-26bc-4592-93f6-14f7a323d2eb.png)

### GET All spells - */spell* or */spell/name*

Returns a response with all spells, listed alphabetically by name

More data entries have been added at this point, refer to <a href="#persistent-database">Persistent Database</a> section)

![PM Get ALL by name](https://user-images.githubusercontent.com/94961352/152525206-a6d0ac2d-adde-4819-8c90-e0bd77923ee8.png)

### GET All spells by level - */spell/lv*

Returns a list of all spells sorted in ascending numerical order of level, then alphabetically

![PM GET ALL by lv](https://user-images.githubusercontent.com/94961352/152525399-161a4cda-4d36-49a3-8fba-89531ba114b2.png)

### GET All spells by school - */spell/school*

Returns a list of all spells sorted alphabetically by school, then name

![PM GET ALL by school](https://user-images.githubusercontent.com/94961352/152525525-3b80a12a-4087-446c-838b-fafa4fb893fd.png)

<p align="right">(<a href="#top">back to top</a>)</p>

## Persistent Database

This image shows the database used for the screenshots in this README.md, in MySQL and as a Postman GET request

![SQL PM GET All](https://user-images.githubusercontent.com/94961352/152526104-86c86f79-bc16-49a0-a8eb-142dad466601.png)

In this screenshot please note the Spring Boot API running and all table data being shown in MySQL:

![Persistent DB start](https://user-images.githubusercontent.com/94961352/152520044-337d354e-e779-469e-a245-e141e5793151.png)

Here you are able to note that the API has been stopped and a fresh query in MySQL still returns the same data, demonstrating persistence:

![Persistent DB end](https://user-images.githubusercontent.com/94961352/152520068-83ec9ae9-179b-4e44-a5c2-381a6ad60e12.png)

<p align="right">(<a href="#top">back to top</a>)</p>

## Test Results & Coverage

48 tests are run, none of which fail:

![JUnitTests](https://user-images.githubusercontent.com/94961352/152520138-0d5d4170-4e3b-4edd-ba29-469c5571f062.png)

This provided testing coverage for */src/main/java/* of **94%**:

![TestCoverage](https://user-images.githubusercontent.com/94961352/152520148-8e898ebc-83bd-418c-a4f2-f745b73522a8.png)


<p align="right">(<a href="#top">back to top</a>)</p>

## Jira Board

Please find a link to this project's Jira Board [here](https://joshoc.atlassian.net/jira/software/projects/QFP/boards/2)!

<p align="right">(<a href="#top">back to top</a>)</p>
