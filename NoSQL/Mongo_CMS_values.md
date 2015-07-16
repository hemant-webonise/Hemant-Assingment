

[1]Query - to show username from Object_id 

db.users.find( { "_id" : ObjectId("55a7be953f995256b0dc2e62")},{ username : 1})

[2]Query - to show all comments based on title 
db.pages.find( { title: "Welcome-page" },{ comments:1 } )


db.pages.find( { title: "Welcome-page" },
                 { comments: { $elemMatch: { "content" : "Welcome"  } } } )
Id of the page { "_id" : ObjectId("55a7a9b508d1da5c09e6ed0d") }

Trying to combine both of them now.



db.users.insert(
{ 
"username" : "Hemant", 
"password" : "webonise123#", 
"timestamps": "14:25", 
"Permission":["read","update","delete"],
"Profile": { "Name" : "xyz", "Age" : 22, "Address" : "Mumbai" }, 
"Phone":["0123456789","770967404"]
}
)



db.users.insert(
{ 
"username" : "FindMe", 
"password" : "webonise123#", 
"timestamps": "14:25", 
"Permission":["read","update","delete"],
"Profile": { "Name" : "xyz", "Age" : 22, "Address" : "Mumbai" }, 
"Phone":["0123456789"]
}
)


/*Something can b changed here*/

db.roles.insert(
{
 "id":"1"
 "type":"superAdmin"
 /*Can have permissions in here-roletype*/
}
)

db.permissions.insert(
{
 "id":"1",
 "permission":["read","delete","update"]
}
)


/*db.roles.insert(
{
"_id":"r1",
"type":"superAdmin",
"permissions":["read", "write", "manage users", "manage pages"]
})*/



db.pages.insert( 
{
"title": "Welcome-page",
"slug": "Welcome",
"user_id" : "Hemant",
"contents" : "This is my first page",
"comments": [{ "comment1": { "content" : "Welcome" , "user_id" : "Hemant" ,"liked" : true},
               "comment2": { "content" : "Bye", "user_id" : "Himani"}
            }]
}
)


db.pages.insert( 
{
"title": "Second Page",
"slug": "Welcomed already",
"user_id" : "FindMe_id",
"contents" : "This is my secound page",
"comments": [{ "comment1": { "content" : "We have alreaedy meet" , "user_id" : "Hemant" ,"liked" : true},
               "comment2": { "content" : "Bye", "user_id" : "Himani"},
               "comment3": { "content" : "We have alreaedy meet" , "user_id" : "Hemant" ,"liked" : true},
            }]
}
)

db.pages.insert( 
{
"title": "Second Page",
"slug": "Welcomed already",
"user_id" : "Hemant",
"contents" : "This is my secound page",
"comments": [{ "comment1": { "content" : "We have alreaedy meet" , "user_id" : "Hemant" ,"liked" : true},
               "comment2": { "content" : "Bye", "user_id" : "Himani"},
               "comment3": { "content" : "We have alreaedy meet" , "user_id" : "Hemant" ,"liked" : true},
            }]
}
)





db.blogs.insert( 
{
"title": "Welcome-page to the blog",
"slug": "Welcome",
"user_id" : "Akshay",
"contents" : "This is my first page",
"comments": [{ "comment1": { "content" : "Welcome to blog " , "user_id" : "Hemant" ,"liked" : true},
               "comment2":{"content" : "Bye - blogger", "user_id" : "Himani"}
            }]
}
)




