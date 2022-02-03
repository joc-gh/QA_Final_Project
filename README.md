# Final Project - SpellTracker

## What Are We Doing And Why?
As a means of marking the end of this Software Development course with [QA](https://www.qa.com/) we are creating individual projects in order to showcase the skills which we have learned. The objective:

>To create a Spring Boot API, with utilisation of supporting tools, methodologies, and technologies, that encapsulates all fundamental and practical modules covered during training.

This will be achieved by producing a back-end developed application written in **Java** with a persistent, managed database hosted locally using **MySQL** that is capable of working with API calls by means of **Postman**. Project management will be conducted through **Jira**. Testing will be carried out with **JUnit** and **Mockito**.

To meet these goals I have decided to make an API which is capable of storing and manipulating some basic information about spells used in the Tabletop Role-Playing Game [Dungeons & Dragons](https://dnd.wizards.com/dungeons-and-dragons/what-is-dd).

<p align="right">(<a href="#top">back to top</a>)</p>

#### Scope & Minimum Viable Product
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

##What Went Well & What Went Not-So-Well?

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

<p align="right">(<a href="#top">back to top</a>)</p>

## Persistent Database

<p align="right">(<a href="#top">back to top</a>)</p>

## Test Results & Coverage

<p align="right">(<a href="#top">back to top</a>)</p>

## Jira Board

Please find a link to this project's Jira Board [here](https://joshoc.atlassian.net/jira/software/projects/QFP/boards/2)!

<p align="right">(<a href="#top">back to top</a>)</p>
