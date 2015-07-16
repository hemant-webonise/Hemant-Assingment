/*

ASSIGNMENT :

Eliza Abraham : I here am trying to start moving from the SQL Schema and so thinking in a DOD way, and assignment was given to make a CMS schema which is further expected to be used in mongoDB database.
The approach taken was in in a way to make one Collection and various Documents with Key-pair values in it.

QUESTION :

Basic CMS in MongoDB


User (login info, timestamps, username)
User - profile (name, address, phone, etc.)
Roles (super admin, admin, editor)
Pages (title, content, slug)
Comments (owner, title)

*/


[1]Query - to show username from Object_id 

var a=db.users.find( { "_id" : ObjectId("55a7be953f995256b0dc2e62")},{ username : 1})

[2]Query - to show all comments based on title 
db.pages.find( { title: "Welcome-page" },{ comments:1 } )


db.pages.find( { title: "Welcome-page" },
                 { comments: { $elemMatch: { "content" : "Welcome"  } } } )
Id of the page { "_id" : ObjectId("55a7a9b508d1da5c09e6ed0d") }

Trying to combine both of them now.



So I initially started looking to some CMS's, saw Wordpress.

Our minimum requirement where to have User, User's Profile, and Roles, Pages and Comments.

Approach : 

We have User and User's Profile, so these are related entities so we can put User's Profile in User's Document. 



user
{
	_id : Object_Id()
	username : "String" - login info
	password : "String" - login info

	role_id : "String"  - will be taken from ROLES;

	permission_id : [Array storing  string values of different permissions granted to the user] -  will be taken from PERMISSION;
	
 	timestamps : "String"
	
	profile : {
		    _id:Object_id()
		    name : "String"
		    age : Integer
		    address : [{Local_address:{ _id : Object_id()
					        street : "String"
					        city : "String"
					      
			      }]
		    phone : [Array of phone-numbers in CSV]
		   }
}


We have Roles, Pages, Blogs which are not dependent on each other so we can keep them in separate Documents. But we have Comments on pages and blog both, and the twist is that the comments will be specific to one page, those comments should not go on any page because they are for specific text on the page/blog so we have to include comments in both Page and blog independently.


Creates a document for Role specified to users 

role{
	id : "String"
        role-type : "String"
     }

Creates a document for permissions specific to roles for the user.The liked key used is simply going to tell if anyone liked the comment and will not give you who liked and how many people liked.

permission{
	id : "String"
        list : [ Array of permissions for role-type]
      }


roles{
	_id:"String",
        "type":"superAdmin",
        "permissions":["read", "write", "manage users", "manage pages"]
}


Creates a document for a page 

page{
	_id : Object_id()
	title : "String"
	slug : "String"
	user_id : Integer
	contents : "String"
	comments : [{ comment1:{_id : Object_id(), content : "String" , user_id : Integer, liked : Boolean} 
		      comment2:{_id : Object_id(), content : "String" , user_id : Integer, liked : Boolean}
		   }]
     }

Creates a document for blog - we can have tags and then connect it to pages.

blog{
	_id : Object_id()
	title : "String"
	slug : "String"
	user_id : Integer
	contents : "String"
	comments : [{ comment1:{_id : Object_id(), content : "String" , user_id : Integer, liked : Boolean}
		      comment2:{_id : Object_id(), content : "String" , user_id : Integer,liked : Boolean}
		   }]
     }





