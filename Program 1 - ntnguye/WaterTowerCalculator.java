
def break_into_words():

    book = open('tsawyer.txt')
    words_list = []
    for line in book:
        for item in line.split():
            item = del_punctuation(item)
            item = item.lower()
            #print(item)
            words_list.append(item)
    return words_list


def del_punctuation(item):

    punctuation = string.punctuation
    for c in item:
        if c in punctuation:
            item = item.replace(c, '')
    return item 


def create_dict():

    words_list = break_into_words()
    dictionary = {}
    for word in words_list:
        if word not in dictionary:
            dictionary[word] = 1
        else:
            dictionary[word] += 1
       
    return dictionary


def words_list():
    '''
        This function returns words list from words.txt file.
    '''
    res = []
    fin = open('words.txt')
    for line in fin:
        word = line.strip()
        res.append(word)
    return res

def avoids():
    dictionary = words_list()
    book = create_dict()
    count = 0
    for i in book:
        if i not in dictionary:
            print(i)
            count += 1
    print('In total there are {} words which are not in words.txt file'.format(count))


dictionary = create_dict()
dictionary.pop('', None)  # accidentally 5 empty strings appeared in the dictionary. why?
    
start_time = time.time()
print('The total number of words in the book is .format(len(break_into_words())))
print('The number of different words used in the book '.format(len(dictionary)))
function_time = time.time() - start_time
