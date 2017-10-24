package co.folto.playground.model

/**
 * Created by daniel.hermawan on 10/23/17.
 */
data class Contact(
    val name: String,
    val online: Boolean
) {
    companion object {
        private var lastContactId = 0
        fun createContanctsList(numContact: Int): MutableList<Contact> {
            val contacts = ArrayList<Contact>()
            for (i in 1..numContact) {
                contacts.add(Contact("Person ${lastContactId}", i < numContact / 2))
                lastContactId += 1
            }
            return contacts
        }
    }
}