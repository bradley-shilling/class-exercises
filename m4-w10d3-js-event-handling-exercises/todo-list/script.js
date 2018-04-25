




/* 2. When I click an x next to the label, the item is deleted. */
document.querySelectorAll("span.delete").forEach(function (element) {
    element.addEventListener("click", deleteTask);
});

function deleteTask() { 
    // Find the Parent
    let taskDiv = this.parentElement; 
    // Remove it from the DOM
    taskDiv.remove();
}


/* 3. When I enter an item in the textbox it is added as an item */
document.getElementById("new-task").addEventListener("submit", addTask);

function addTask(event) { 
    // Block form submission
    event.preventDefault();

    // Get the new value typed in
    let inputField = document.querySelector('input[name=newTaskValue]');
    let newTask = inputField.value;

    // Clear the value from the textbox
    inputField.value = '';

    // Create a <div class="task">
    let newTaskDiv = document.querySelector('div#taskTemplate').cloneNode(true);
    newTaskDiv.querySelector('label').innerText = newTask;
    newTaskDiv.id = '';
    newTaskDiv.style.display = '';
    newTaskDiv.querySelector("span.delete").addEventListener("click", deleteTask);
    newTaskDiv.querySelector("div.task input[type=text]").addEventListener("keyup", checkForEnter);

    // Add to the task list
    let taskList = document.getElementById('task-list');
    taskList.appendChild(newTaskDiv);


}



/* 4. When I click toggle all, all tasks are either completed or reset */

function toggleAll() { 
    // Get the value of the toggle Checkbox
    let source = document.getElementById("toggle").value;
    // Get all tasks
    
    checkboxes = document.querySelectorAll("div.task input[type=checkbox]");
    
    // Loop through each and set checked value
    for(var i=0, n=checkboxes.length;i<n;i++) {
        checkboxes[i].checked = source;
    }
}

/* 5. When I click a label, it turns into a textbox */
function labelClick(label) { 

    // Find the adjacent texbox
    let textBox = label.parentElement.querySelector("input[type=text]");

    // Set its value from the label
    let textValue = label.innerText;
    textBox.value = textValue;

    // Toggle Visibility
    textBox.classList.remove("hidden");
    label.classList.add("hidden");


}

 // 6. Providing an empty value removes the item
document.querySelectorAll("div.task input[type=text]").forEach((element) => {
    element.addEventListener("keyup", checkForEnter)
});

function checkForEnter(textbox) { 
    if(event.keyCode !== 13){ // check for all keys other than enter
        return;
    }
    // Find the adjacent label
    let label = this.parentElement.querySelector("label");

    // 6. Providing an empty value removes the item
    if(this.querySelector["input[type=text]"].value === ''){
       deleteTask();
    };
    


    // Set its value from the textbox
    label.innerText = this.value;
    // Toggle Visibility
    this.classList.add("hidden");
    label.classList.remove("hidden");
}



/* 7. When there are completed tasks, the clear completed item is visible */
function clearCompleted() { 

    // Get all completed items
    
    // Get the #task-list

    // Remove each completed item from the #task-list
}

function completeTask() { 
    // Get the number of completed items

    // Get the clear completed button

    // If the number is > 0, show the clearCompleted button
}