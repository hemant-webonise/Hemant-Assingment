(function() {

	var todo = document.querySelector('#todolist'),
	 form = document.querySelector('form'), 
	 field = document.querySelector('#newitem') ,
	 tb = document.querySelector('#tb6'),
	 todo1 = document.querySelector('#todolist1'),
	 todo2 = document.querySelector('#todolist2'), 
	 todo3 = document.querySelector('#todolist3');
	
	/*alert(todo);  */
    

	form.addEventListener('submit', function(ev) {
		var a = field.value
		todo.innerHTML += '<li>' + a + '</li> ';
		todo2.innerHTML += '<li>' + a + '</li> ' ;
		field.value = '';
		field.focus();
		storestate();
		ev.preventDefault();
	}, false);
    var temp;
    function storestateCompleted(temp) {
		todolist3.innerHTML  += '<li>' + temp + '</li> ';	
	}
	;
	todo.addEventListener('click', function(ev) {
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
			todo1.innerHTML = '<li>' + localStorage.todolist; + '</li>';
		}
		;
		ev.preventDefault();
	}, false);
    


    todo3.addEventListener('click', function(ev) {
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
		;
		ev.preventDefault();
	}, false);

	

	document.addEventListener('DOMContentLoaded', retrievestate, false);

	function storestate() {
		localStorage.todolist = todo.innerHTML;
		localStorage.todolist2 = todo2.innerHTML;
		localStorage.todolist3 = todo3.innerHTML;
	}
	;
	

	function retrievestate() {
		if (localStorage.todolist) {
			todo.innerHTML = localStorage.todolist;
			todo2.innerHTML = localStorage.todolist2;
			todo3.innerHTML = localStorage.todolist3;
			}
	}
	;

})();

