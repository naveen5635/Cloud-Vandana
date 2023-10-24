function SortDescending(array) {
    const n = array.length;
    let swapped;

    do {
        swapped = false;

        for (let i = 0; i < n - 1; i++) {
            if (array[i] < array[i + 1]) {
                let temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;

                swapped = true;
            }
        }
    } while (swapped);

    return array;
}
