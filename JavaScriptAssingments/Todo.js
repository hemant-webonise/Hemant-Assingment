(function() {

	var form = document.querySelector('form'),field = document.querySelector('#newitem'),tb = document.querySelector('#tb6');
	var temp;
	
      
        var todoMaker = {todo : document.querySelector('#todolist'),todo1 : document.querySelector('#todolist1'),
	                 todo2 : document.querySelector('#todolist2'),todo3 : document.querySelector('#todolist3')
                        };
        
        /*Class for Storage*/
        var MyStorage = function(){
	this.storestate = function() {
		localStorage.todolist = todoMaker.todo.innerHTML;
		localStorage.todolist2 = todoMaker.todo2.innerHTML;
		localStorage.todolist3 = todoMaker.todo3.innerHTML;
	}
	;
	

	this.retrievestate = function() {
		if (localStorage.todolist) {
			todoMaker.todo.innerHTML = localStorage.todolist;
			todoMaker.todo2.innerHTML = localStorage.todolist2;
			todoMaker.todo3.innerHTML = localStorage.todolist3;
			}
	}
	;

        this.storestateCompleted = function(temp) {
		todolist3.innerHTML  += '<li>' + temp + '</li> ';	
	}
	;
        };


	myStorage = new MyStorage();
        
        /*
        TRIED MAKING IT MORE OBJECT ORIENTED 

	form.addEventListener('submit', myFunction0(this), false);
	todoMaker.todo.addEventListener('click', myFunction(ev), false);
	todoMaker.todo3.addEventListener('click', myfunction1(ev), false);
	document.addEventListener('DOMContentLoaded', retrievestate, false);


		function myFunction0(ev) {
			var a = field.value
			todoMaker.todo.innerHTML += '<li>' + a + '</li> ';
			todoMaker.todo2.innerHTML += '<li>' + a + '</li> ' ;
			field.value = '';
			field.focus();
			storestate();
			ev.preventDefault();
		}
	

    
	

		function myFunction(ev) {
			var t = ev.target;
			if (t.tagName === 'LI') {
				if (t.classList.contains('done')) {
					temp= t.innerHTML;
					storestateCompleted(temp);	
					t.parentNode.removeChild(t);				
				} else {
					t.classList.add('done');
				}
				storestate();
				todoMaker.todo1.innerHTML = '<li>' + localStorage.todolist; + '</li>';
			}
		
  		}


    

     		function myFunction1(ev) {
		var t = ev.target;
		if (t.tagName === 'LI') {
			if (t.classList.contains('done')) {
				temp= t.innerHTML;
				t.parentNode.removeChild(t);

				
			} else {
				t.classList.add('done');
			}
			storestate();
		}
		
		ev.preventDefault();
		}		
	*/

	form.addEventListener('submit', function(ev)
		{
			var a = field.value
			todoMaker.todo.innerHTML += '<li>' + a + '</li> ';
			todoMaker.todo2.innerHTML += '<li>' + a + '</li> ' ;
			field.value = '';
			field.focus();
			myStorage.storestate();
			ev.myStorage.preventDefault();
		}, false);

	
	todoMaker.todo.addEventListener('click', function(ev){
		var t = ev.target;
		if (t.tagName === 'LI') {
			if (t.classList.contains('done')) {
				temp= t.innerHTML;
				myStorage.storestateCompleted(temp);	
				t.parentNode.removeChild(t);				
			} else {
				t.classList.add('done');
			}
			myStorage.storestate();
			todoMaker.todo1.innerHTML = '<li>' + localStorage.todolist; + '</li>';
		}
		;
		ev.preventDefault();
	},false);
    


        todoMaker.todo3.addEventListener('click', function(ev) {
		var t = ev.target;
		if (t.tagName === 'LI') {
			if (t.classList.contains('done')) {
				temp= t.innerHTML;
				t.parentNode.removeChild(t);

				
			} else {
				t.classList.add('done');
			}
			myStorage.storestate();
			}
		;
		ev.preventDefault();
	}, false);

	

	document.addEventListener('DOMContentLoaded', myStorage.retrievestate, false);

	


})();




