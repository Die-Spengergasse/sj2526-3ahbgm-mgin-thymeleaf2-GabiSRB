

function openModal(button) {
    const c = {
        id: button.getAttribute('data-id'),
        brand: button.getAttribute('data-brand'),
        model: button.getAttribute('data-model'),
        ps: button.getAttribute('data-ps'),
        construction: button.getAttribute('data-construction'),
    };

    document.getElementById("id").value = c.id;
    document.getElementById("modalTitle").innerHTML = c.brand + " " + c.model +  " bearbeiten";
    document.getElementById("brand").value = c.brand ;
    document.getElementById("model").value = c.model;
    document.getElementById("ps").value = c.ps;
    document.getElementById("construction").value = c.construction;
    console.log(c);
    $('#carModal').modal('show');
}