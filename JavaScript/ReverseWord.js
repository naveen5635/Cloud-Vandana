function reverseWords(sentence) {
    // splits the sentence
    var words = sentence.split(' ');
    var revWords = [];

    // reverse each word and store it in a new array
    for (var i = 0; i < words.length; i++) {
        var word = words[i];
        var reversedWord = '';
        for (var j = word.length - 1; j >= 0; j--) {
            reversedWord += word[j];
        }
        revWords.push(reversedWord);
    }

    // join the reversed words to form the final reversed sentence
    var reversedSentence = revWords.join(' ');

    return reversedSentence;
}
